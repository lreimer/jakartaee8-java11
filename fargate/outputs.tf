output "alb_hostname" {
  value = aws_alb.main.dns_name
}

output "Registry URL" {
  value = aws_ecr_repository.jee_app.repository_url
}
