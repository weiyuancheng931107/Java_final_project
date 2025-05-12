
# Java Music Application (Web-Based)

Java Music Application is a Java-based backend application designed for various music-related functionalities, including creating, processing, and manipulating MIDI files, generating rhythms, and defining musical styles. The frontend has been transitioned from Java Swing to a modern **web-based interface**, allowing users to interact via browsers.

---

## Project Structure

The structure and functionalities of the project are described below. There are a few architectural design principles in this project:

- All classes follow the principles of object-oriented programming.
- Builder classes are used for creating complex objects.
- The project makes extensive use of Java standard libraries and MIDI support.

---

## Files and Their Functions

### Core Music Processing Classes

- **Note.java**  
  This class is responsible for classifying and representing musical notes.

- **Chord.java**  
  Handles chord-related operations, such as creating chords and defining chord structures.

- **DefineStyle.java**  
  Allows users to define and apply different musical styles to MIDI sequences, and merge files accordingly.

- **Judge.java**  
  Evaluates musical sequences by analyzing their structure and rhythm to meet predefined styles.

- **Metronome.java**  
  Provides tempo control with audible beat (with pitch).

- **MetronomeWithNoPitch.java**  
  Similar to `Metronome`, but outputs beat without pitch, acting like a percussion click.

- **MidiGenerator.java**  
  Responsible for generating and playing MIDI sequences based on tempo, rhythms, and note data.

- **MidiMerger.java**  
  Merges multiple MIDI files while maintaining musical coherence and resolving overlaps.

- **ReadSheet.java**  
  Reads textual or file-based musical notation input and parses it into MIDI-compatible sequences.

- **Drumsound.java**  
  Defines individual drum sounds used across rhythm styles.

---

### Rhythm Style Classes

Each of the following classes is responsible for generating its respective rhythm using distinct patterns and time signatures:

- **Funk.java**
- **Jazz.java**
- **BossaNova.java**
- **Reggae.java**
- **RnB.java**
- **Rock.java**
- **Soul.java**

---

### Web-Adapted GUI Components

> 🧭 Originally developed in Swing, now migrated to a web frontend.

- **MusicApp.java**  
  Serves as the backend's main entry point. It initializes core music logic and exposes endpoints to the frontend via a web API (e.g., using Spring Boot or a lightweight HTTP server).

- **PianoPanel.java**  
  Provides a visual and interactive piano keyboard. In the web version, this is implemented using HTML/CSS with JavaScript (e.g., WebAudio or Tone.js).

- **MusicNotation.java**  
  Handles the backend logic for creating and managing a single musical notation.

- **MusicNotations.java**  
  Extends `MusicNotation` to support multi-notation compositions.

- **Notes.java**  
  Represents individual note objects, their pitch, duration, and intensity.

---

## Web-Based Frontend

The GUI has been transitioned from Java Swing to a modern web application stack. The frontend allows users to:

- Play piano notes via UI
- View and edit music notations interactively
- Choose musical styles
- Generate and export MIDI

### Technologies Used

- **Frontend Framework**: React (or Vue/Svelte as preferred)
- **UI Rendering**: HTML5 + CSS3
- **Music Notation**: VexFlow or ABCjs
- **MIDI Playback & Audio**: Web Audio API / Tone.js
- **Communication with Backend**: RESTful API (e.g., /api/generate, /api/style/funk)

---

## Building the Project

### Backend Setup (Java)

1. Install JDK 17+  
2. Compile the backend:
   javac -d out src/com/musicapp/*.java
3. (Optional) Run with a web server (e.g., Spring Boot or NanoHTTPD)

### Frontend Setup (Web)

1. Install Node.js
2. Navigate to frontend/ directory
3. Run:
   npm install
   npm start

> Ensure frontend/src/api/config.js points to http://localhost:8080/api or your Java backend.

---

## Contributing

Contributions to the Java Music Application are welcome. To contribute:

1. Fork the repository
2. Create a new branch (git checkout -b feature-X)
3. Commit your changes
4. Push to your fork
5. Create a pull request

Please follow OOP principles, add comments, and include test cases or UI demos if relevant.

---

## Built With

- Java Standard Libraries
- javax.sound.midi
- Node.js / npm
- React / HTML / CSS
- Tone.js / VexFlow
- RESTful APIs

---

## Versioning

We use Semantic Versioning. Check repository tags for available versions.

---

## Contact

For feedback, bug reports, or collaboration:

📧 ankeng40426@gmail.com
