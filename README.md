# Real‑Time Transaction Limit Validator

## Run locally
```bash
# start Kafka
docker compose up -d
# create topics
./scripts/create-topics.sh

# build & run service\mvn clean package
java -jar target/limit-validator-0.1.0-SNAPSHOT.jar
