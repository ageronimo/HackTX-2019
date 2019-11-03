// FUNCTIONS
// Get the height of the screen and set body height to it
let screenHeight = window.innerHeight;
let screenWidth = window.innerWidth;
let homeContentContainer = document.getElementById("home-content-container");
let setHeightAndWidth = (height, width) => {
    homeContentContainer.style.height = height + "px";
    homeContentContainer.style.width = width + "px";
}

// FUNCTIONALITY EXECUTION
setHeightAndWidth(screenHeight, screenWidth);