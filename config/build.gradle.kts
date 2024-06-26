subprojects {
    dependencies {
        implementation("org.springframework.cloud:spring-cloud-config-server")
    }

    dependencyManagement {
        imports {
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
        }
    }
}
