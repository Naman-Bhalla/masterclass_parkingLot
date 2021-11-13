- Start with coding different entities

Step 1: create different folders you are going use
- models => All the entities of the system ->
  - ParkingLot
  - ParkingFloor
  - ParkingSpot
- services
  - GenerateTicketService: generate a ticket
    - and assign a spot
  - PaymentService
- repositories: Store Data: In memory storage
  - classes that have functions to interact with the storage layer
- controllers: are the classes via which external clients will
  - interact with the system
- daos: Data Access Objects: when you are storing data, you mihght
  - store ina different way
- dtos: Data Transfer Objects

User
- name
- email
- password
- id
- isGoodUser

DTOs are models in a format that can be transferred to public