# k8s-projects
This repository contains the varisous projects for Docker, Kubernetes, microservices etc.


#To Start CSM
docker run -e D_CSM_HOST=192.168.1.104 -e D_CSM_PORT=81 -e D_DB_HOST=192.168.1.104 -e D_DB_PORT=1433 -e D_DB_SCHEMA=dcsm -e D_DB_USER=csm -e D_DB_PASSWORD=p@ssw0rd --hostname csm --name csm -p 81:81 hub.docker.local:5000/bank/csm-sqlserver 

#To Start TRN
docker run -e T_CSM_HOST=192.168.1.104 -e T_CSM_PORT=81 -e T_DB_HOST=192.168.1.104 -e T_DB_PORT=1433 -e T_DB_SCHEMA=dtrn -e T_DB_USER=trn -e T_DB_PASSWORD=p@ssw0rd --hostname trn --name trn -p 82:82 hub.docker.local:5000/bank/trn-sqlserver 