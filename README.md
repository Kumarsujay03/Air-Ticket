# Air-Ticket

A console-based **airline ticket booking system** in Java. Book tickets between
28 Indian cities, look up a booking by PNR, and cancel tickets. Bookings are saved to disk, so they persist between runs.

## Features

- **Booking:** choose date, source and destination; a unique PNR is generated
- **PNR check:** look up a booking by its PNR
- **Cancel:** cancel a booking by PNR
- **Persistence:** bookings are stored in `Records.txt` using Java serialization

## Requirements

- Java 17 or newer (uses switch expressions and text blocks)

## Run it

```bash
git clone https://github.com/Kumarsujay03/Air-Ticket.git
cd Air-Ticket
javac -d out src/AirTicket.java
java -cp out AirTicket
```

Then choose from the menu:

```text
1.BOOKING
2.PNR CHECK
3.UPDATE DETAILS   (coming soon)
4.CANCEL
0.EXIT
```

## Roadmap

- [ ] Update passenger details on an existing booking (menu option 3)

## Project structure

```text
Air-Ticket/
├── src/AirTicket.java   # Ticket model and menu-driven booking logic
└── Records.txt          # Saved bookings (created on first booking)
```

## What I learned

Built as an early Java project: object serialization for persistence,
collections and iterators, and structuring a menu-driven CLI program.

## License

[MIT](LICENSE)
