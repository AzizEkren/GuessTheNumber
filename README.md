# GuessTheNumber

## 📱 About the App
**Guess the Number** is a simple Android game where the player must guess a randomly generated number between 0 and 100 within a limited number of attempts. The app provides hints to help the player: "Higher" or "Lower" based on the guessed number.

The game has a win/loss outcome:
- **Win**: If the player guesses the number correctly, they win the game.
- **Loss**: If the player runs out of attempts without guessing the number, the game ends in a loss.

The app is designed with a simple and clean user interface and uses basic Android components such as `Activity`, `Intent`, and `View Binding`.

---

## ⚙️ Features
- **Random number generation**: The app randomly generates a number between 0 and 100.
- **Attempts counter**: The player has a limited number of attempts to guess the correct number.
- **Hints**: The app provides feedback, "Higher" or "Lower", based on the player’s guess.
- **Result screen**: Displays whether the player won or lost, with an option to restart the game.

---

## 💻 Tech Stack
- **Kotlin** for Android development.
- **Android Studio** as the IDE.
- **View Binding** to manage UI components.

---

## 🕹️ How to Play
1. Launch the app, and the `MainActivity` screen will appear.
2. Click on the **"Start"** button to begin the game.
3. Enter a guess between 0 and 100 and click **"Guess"**.
4. The app will provide feedback:
    - If the guess is too high or low, it will display a hint: "Higher" or "Lower".
    - If the guess is correct, the player wins and will be taken to the `ResultActivity` with a "Victory!" message.
    - If the player runs out of attempts, they will lose the game, and the `ResultActivity` will show a "Game Over!" message.
5. Press **"Retry"** to start a new game.
## ScreenShots
(1.png) (2.png) (3.png) (4.png)

## 📥 Installation
To install and run the app locally on your machine:
1. Clone the repository:
   ```bash
   git clone https://github.com/AzizEkren/GuessTheNumber
