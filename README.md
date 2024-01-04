# Photos API

![java](https://custom-icon-badges.herokuapp.com/badge/Java-E34F26?logo=java&logoColor=white)
![spring boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?logo=Spring-Boot&logoColor=white)
![visual studio code](https://img.shields.io/badge/Visual%20Studio%20Code-007ACC?logo=Visual-Studio-Code&logoColor=white)

Photo App API is a simple Spring Boot project designed for uploading and downloading photos efficiently.

## Features

- **Photo Management:** Upload, download, and delete photos associated with users.
- **Authentication:** Secure endpoints using JWT-based authentication.
- **Database:** Utilizes H2 database for data storage.

## Technologies Used

- Gradle
- Spring Boot
- H2 Database
- Spring Data JPA

## Prerequisites

- OpenJDK 21

## Installation

Clone the repository using `git`

```
git clone https://github.com/Prakashdeveloper03/Photo-App.git
```

Change to the cloned directory

```
cd <directory_name>
```

Then, Build and Run the application

```
./gradlew bootRun
```

## API Endpoints

- GET `/photos`: Retrieve all photos.
- POST `/photos`: Insert new photo.
- GET `/photos/{id}`: Retrieve a specific photo by ID.
- DELETE `/photos/{id}`: Delete an existing photo.
- GET `/download/{id}`: Download a specific photo by ID.
