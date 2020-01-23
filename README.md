# Jakarta EE 8 with Java 11 on Payara 5.194

Demo micro service using Jakarta EE 8 with Java 11 on Payara 5.194.

## Building and Running

To run the service locally, make sure to install the latest version of [Skaffold](https://skaffold.dev).

```
$ ./gradlew clean ass
$ skaffold dev --port-forward
```

## Deploying

Thanks for this excellent blog post https://medium.com/@bradford_hamilton/deploying-containers-on-amazons-ecs-using-fargate-and-terraform-part-2-2e6f6a3a957f

```
$ terraform init fargate/
$ terraform plan fargate/
$ terraform apply fargate/
```

## Maintainer

M.-Leander Reimer (@lreimer), <mario-leander.reimer@qaware.de>

## License

This software is provided under the MIT open source license, read the `LICENSE`
file for details.
