# Projeto Final de Programação Multiplataforma - Módulo 3

> Projeto desenvolvido por Ana Julia Lima de Oliveira como uma Lambda.

> Este módulo só possui esta aplicação.

---

## Como iniciar o projeto localmente

### 1. Git clone
```bash
git clone https://github.com/AnaJulia-FATEC-Projeto-Final/modulo3.git

cd modulo3
````

### 2. Construir containers e Rodar via IDE (recomendado)
```bash
docker-compose up -d

# Abra a IDE (IntelliJ recomendado) e importe o projeto
```

### 3. Você também pode rodar via Docker:
```bash
mvn clean package -DskipTests

docker build -t anajulia/modulo3:latest .

# Descomente a última seção do docker-compose.yml para rodar via Docker Compose
docker-compose up -d
```

### 4. Para testar a lambda e o kafka localmente

> Com a aplicação rodando, você pode enviar mensagens para o Kafka usando o console.

```bash
# Acesse o container da lambda
docker exec -it kafka bash

# Envie uma mensagem de teste para o tópico 'pessoa.atualizada'
echo '{"nome":"Ana Julia","dt_nascimento":"2006-02-27"}' | kafka-console-producer --broker-list localhost:9093 --topic pessoa.atualizada
```