const API_URL = "https://opentdb.com/api.php?amount=10&type=multiple";
let questions = [];
let currentQuestionIndex = 0;
let score = 0;
let timer;

document.getElementById("start-btn").addEventListener("click", startGame);
document.getElementById("restart-btn").addEventListener("click", resetGame);

async function startGame() {
    const category = document.getElementById("category").value;
    const difficulty = document.getElementById("difficulty").value;
    
    const response = await fetch(`${API_URL}&category=${category}&difficulty=${difficulty}`);
    const data = await response.json();
    
    questions = data.results;
    currentQuestionIndex = 0;
    score = 0;

    document.getElementById("start-screen").style.display = "none";
    document.getElementById("quiz-screen").style.display = "block";

    renderQuestion();
}

function renderQuestion() {
    if (currentQuestionIndex >= questions.length) {
        return renderEndScreen();
    }

    const questionData = questions[currentQuestionIndex];
    const answers = [...questionData.incorrect_answers, questionData.correct_answer];
    answers.sort(() => Math.random() - 0.5);

    document.getElementById("question").textContent = questionData.question;
    document.getElementById("score").textContent = `Score: ${score}`;
    
    const optionsContainer = document.getElementById("options");
    optionsContainer.innerHTML = answers.map(ans => 
        `<button onclick="selectAnswer(this, '${ans}', '${questionData.correct_answer}')">${ans}</button>`
    ).join('');

    document.getElementById("feedback").textContent = "";
    startTimer();
}

function startTimer() {
    let timeLeft = 15;
    const timerElement = document.getElementById("timer");
    clearInterval(timer);
    timer = setInterval(() => {
        timeLeft--;
        timerElement.textContent = `Time Left: ${timeLeft}s`;
        if (timeLeft === 0) {
            clearInterval(timer);
            revealAnswer();
        }
    }, 1000);
}
function selectAnswer(button, selected, correct) {
    clearInterval(timer);
    const feedbackElement = document.getElementById("feedback");

    if (selected === correct) {
        score++;
        feedbackElement.textContent = "Correct!";
        feedbackElement.style.color = "green";
    } else {
        feedbackElement.textContent = `Wrong! Correct answer: ${correct}`;
        feedbackElement.style.color = "red";
    }

    // Move to next question after delay
    setTimeout(() => {
        currentQuestionIndex++; // Ensure index is updated before rendering the next question
        if (currentQuestionIndex < questions.length) {
            renderQuestion();
        } else {
            renderEndScreen(); // End quiz if all questions are answered
        }
    }, 2000);
}


function revealAnswer() {
    const feedbackElement = document.getElementById("feedback");
    feedbackElement.textContent = `Time's up! Correct answer: ${questions[currentQuestionIndex].correct_answer}`;
    feedbackElement.style.color = "orange";

    setTimeout(() => {
        currentQuestionIndex++;
        renderQuestion();
    }, 2000);
}

function renderEndScreen() {
    document.getElementById("quiz-screen").style.display = "none";
    document.getElementById("end-screen").style.display = "block";
    document.getElementById("final-score").textContent = `Your Score: ${score}`;
}

function resetGame() {
    document.getElementById("end-screen").style.display = "none";
    document.getElementById("start-screen").style.display = "block";
}
