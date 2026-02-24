# 🚚 Logistics CI/CD Pipeline Project  
### Spring Boot + Docker + GitHub Actions + AWS EC2

---

##  Project Overview

This project demonstrates a professional DevOps-based CI/CD pipeline for a Logistics REST application built using Spring Boot.

The pipeline automates:

- Application build
- Testing
- WAR file generation
- Docker image creation
- Docker Hub push
- Deployment on AWS EC2

The goal is to eliminate manual deployment steps and implement a scalable, automated enterprise-style workflow.

---

## ❗ Problem Statement

Traditional software deployment processes involve manual building, testing, and deployment of applications. This approach is:

- Time-consuming  
- Error-prone  
- Difficult to scale  
- Environment inconsistent  
- Hard to maintain  

Modern enterprises require automated CI/CD workflows for faster and reliable delivery.

---

##  Project Objectives

- Develop Spring Boot Logistics REST API  
- Implement CI/CD using GitHub Actions  
- Automate Maven build & testing  
- Generate WAR file  
- Dockerize application with Tomcat  
- Push Docker image to Docker Hub  
- Deploy application on AWS EC2  
- Implement health check endpoint  
- Follow DevOps best practices  

---

##  Architecture

Developer → GitHub → GitHub Actions → Docker Hub → AWS EC2 → Users

---

## Tools & Technologies

| Category | Technology |
|--------|-----------|
| Language | Java |
| Framework | Spring Boot |
| Build Tool | Maven |
| Web Server | Apache Tomcat |
| Containerization | Docker |
| CI/CD | GitHub Actions |
| Version Control | GitHub |
| Image Registry | Docker Hub |
| Cloud Platform | AWS EC2 |
| IDE | VS Code |
| OS | Ubuntu |

---

##  Key Features

- Spring Boot REST API  
- Automated CI/CD pipeline  
- Maven WAR generation  
- Dockerized Tomcat deployment  
- Docker Hub integration  
- AWS EC2 cloud hosting  
- Health endpoint `/health`  
- GitHub Secrets for credentials  
- Stateless container architecture  

---

##  CI/CD Workflow

1. Developer pushes code to GitHub  
2. GitHub Actions pipeline triggers  
3. Maven builds WAR and runs tests  
4. Docker image created  
5. Image pushed to Docker Hub  
6. EC2 pulls image  
7. Docker runs Tomcat container  
8. Application available via EC2 Public IP  

---

##  Outputs

- GitHub Actions: Successful CI/CD pipeline  
- Docker Hub: Image pushed with `latest` tag  
- AWS EC2: Container running  
- Browser: Logistics service accessible  
- `/health` endpoint returns OK  

---

##  Key Achievements

- End-to-end CI/CD automation  
- Zero manual deployment  
- WAR generation via Maven  
- Docker containerization  
- Cloud deployment on AWS  
- Health monitoring enabled  
- Enterprise DevOps workflow demonstrated  

---

