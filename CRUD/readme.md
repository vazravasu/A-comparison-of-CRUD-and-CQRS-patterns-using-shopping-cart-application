# CRUD Impimentation of shopping Cart

## Build docker image 
If you want to modify the code then plase create a docker image with the folowing command and update image name accordingly in kubernetes script. Otherwise just run kubernetes script it will automatically download images from my decker repository.
```
mvn compile jib:dockerBuild -Dimage=new_image_name
```
## Deploy
Install kustomize from https://kubectl.docs.kubernetes.io/installation/kustomize/binaries/
```
kubectl create namespace crud
```
```
kubectl config set-context --current --namespace=crud
```
```
./kustomize build .k8s/base/monolithic | kubectl apply -f -
```
## Interacting with application 
use swagger GUI on localhost 8080. If this is not working please check weather loadbalancer has been correctly exposed in kubernetes.

Resources for this project will be added here soon.
