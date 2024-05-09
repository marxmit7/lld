problem statement :

```
Movie Ticket Booking System
An online movie ticket booking system facilitates the purchasing of movie tickets to its customers. E-ticketing systems allow customers to browse through movies currently playing and book seats, anywhere and anytime.

Features
Our ticket booking service should meet the following requirements:

- It should be able to list the cities where affiliate cinemas are located.
- Each cinema can have multiple halls and each hall can run one movie show at a time.
- Each Movie will have multiple shows.
- Customers should be able to search movies by their title, language, genre, release date, and city name.
- Once the customer selects a movie, the service should display the cinemas running that movie and its available shows.
- The customer should be able to select a show at a particular cinema and book their tickets.
- The service should show the customer the seating arrangement of the cinema hall.
- The customer should be able to select multiple seats according to their preference.
- The customer should be able to distinguish between available seats and booked ones.
- The system should send notifications whenever there is a new movie, as well as when a booking is made or canceled.
- Customers of our system should be able to pay with credit cards or cash.
- The system should ensure that no two customers can reserve the same seat.
- Customers should be able to add a discount coupon to their payment.
```


Actor
    - customers
    - admin 
    - FrontDeskOfficer
    - Guest
    
Users
Entity 
    - cinemas
        - halls
            - movie


workflow
    - search movies based upon 
        - title
        - language 
        - genre
        - release date
        - city name
    - ticket booking 
        - customer can select multiple seats

    - notification 
    - payment 
        - customer can add discount

