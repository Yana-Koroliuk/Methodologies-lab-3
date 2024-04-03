FROM python:3.10-alpine

WORKDIR /app

RUN apk add --no-cache gcc musl-dev python3-dev libffi-dev g++ make

COPY requirements.txt .

RUN pip install --no-cache-dir -r requirements.txt

COPY . .

EXPOSE 8080

CMD ["uvicorn", "spaceship.main:app", "--host=0.0.0.0", "--port=8080"]

