FROM golang:latest AS builder

WORKDIR /app

COPY go.mod go.sum ./
RUN go mod download

COPY . .

RUN CGO_ENABLED=0 go build -ldflags '-extldflags "-static"' -o /myapp

FROM gcr.io/distroless/base

COPY --from=builder /myapp /
COPY --from=builder /app/templates/index.html /templates/

CMD ["/myapp", "serve"]