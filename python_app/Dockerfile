FROM python:3.10-bullseye

WORKDIR /app

COPY . .

RUN apt-get update && apt-get install -y

RUN pip install --no-cache-dir -r requirements.txt

EXPOSE 8080

CMD ["uvicorn", "spaceship.main:app", "--host=0.0.0.0", "--port=8080"]


