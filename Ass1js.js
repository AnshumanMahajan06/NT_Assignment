let currentPlayer = 1;
let scores = {1: 0, 2: 0};
let currentScores = {1: 0, 2: 0};
const diceElement = document.getElementById('dice');

function rollDice() {
    let roll = Math.floor(Math.random() * 6) + 1;
    document.getElementById("dice").src = `dice${roll}.png`;
   ////template literals-This means you can insert variables or expressions directly into the string.
    if (roll === 1) {
        currentScores[currentPlayer] = 0;
        switchTurn();
    } else {
        currentScores[currentPlayer] += roll;
    }
    updateScores();
}

function saveScore() {
    scores[currentPlayer] += currentScores[currentPlayer];
    currentScores[currentPlayer] = 0;
    if (scores[currentPlayer] >= 100) {
        document.getElementById('winner').innerText = `${document.getElementById(`player${currentPlayer}Name`).value} Wins!`;
        return;
    }
    switchTurn();
    updateScores();
}

function switchTurn() {
    currentScores[currentPlayer] = 0;
    document.getElementById(`player${currentPlayer}`).classList.remove('active');
    currentPlayer = currentPlayer === 1 ? 2 : 1;
    document.getElementById(`player${currentPlayer}`).classList.add('active');
}

function updateScores() {
    document.getElementById('score1').innerText = scores[1];
    document.getElementById('score2').innerText = scores[2];
    document.getElementById('current1').innerText = currentScores[1];
    document.getElementById('current2').innerText = currentScores[2];
}

function resetGame() {
    scores = {1: 0, 2: 0};
    currentScores = {1: 0, 2: 0};
    currentPlayer = 1;
    document.getElementById('winner').innerText = '';
    document.getElementById('player1').classList.add('active');
    document.getElementById('player2').classList.remove('active');
    updateScores();
}
