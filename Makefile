.DEFAULT_GOAL := help

## GENERAL ##
OWNER 			= lacafetalab
SERVICE_NAME 	= java-ddd-skeleton


## RESULT_VARS ##
ENV 			 ?= dev
PROJECT_NAME      = $(OWNER)-$(SERVICE_NAME)
export IMAGE_JAVA = $(PROJECT_NAME)-java

build: ## build image node : make build
	docker build -f container/dev/Dockerfile -t $(IMAGE_JAVA):latest application

install: ## instala todas las dependencias del proyecto : make install
	@make build

test: ## Ejecuta el test : make test
	@make build
	docker-compose -f container/docker-compose.yml run --rm java

## Target Docker tools ##
bash: ## Execute migrate : make migrate
	docker run -it $(IMAGE_JAVA):latest bash

## Target Docker tools ##
docker-kill: ## Execute migrate : make migrate
	docker rm -f $$(docker ps -aq)

## Target Help ##
help:
	@printf "\033[31m%-16s %-59s %s\033[0m\n" "Target" "Help" "Usage"; \
	printf "\033[31m%-16s %-59s %s\033[0m\n" "------" "----" "-----"; \
	grep -hE '^\S+:.*## .*$$' $(MAKEFILE_LIST) | sed -e 's/:.*##\s*/:/' | sort | awk 'BEGIN {FS = ":"}; {printf "\033[32m%-16s\033[0m %-58s \033[34m%s\033[0m\n", $$1, $$2, $$3}'
