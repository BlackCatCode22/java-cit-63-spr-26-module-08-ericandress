[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/gbN5yE4D)
# tJavaModule08spr26
tJavaModule08spr26

CIT-63 Final Programming Assignment: Java and Spring Boot with Vibe Coding

Course: CIT-63 - Java Programming (Spring Boot and Ngrok)
Professor: Dennis H. Mohle
1. The Challenge

You’ve mastered the fundamentals. You’ve tackled the Zoo Keeper Challenge. Now, you are ready for the professional world of Vibe Coding.

Vibe coding is a brand-new software development practice where you act as the Architect. Instead of writing every semicolon yourself, you guide a high-powered AI assistant (Gemini) through a conversational loop to generate, refine, and deploy full-stack applications. This is a real industry shift—almost all professional programmers use these tools in 2026 to accelerate their workflow.

Today, you will build a Global Weather Dashboard that you can show off to any prospective employer as proof of your "AI-Augmented" engineering skills.

2. Tech Concepts: JSON & Dependencies

In this lab, we use Spring Boot, and we rely on two critical industry concepts:

JSON (JavaScript Object Notation): This is the "language of the internet." When your computer asks a server for weather data, it doesn't get a pretty webpage; it gets a raw, structured text format called JSON. You will learn to "parse" this into something humans actually want to read.

Dependencies: Imagine building a car. You don't forge the steel yourself; you "depend" on specialized manufacturers for parts. In Java, we use Maven to manage these "parts" (libraries) so we don't have to write thousands of lines of networking and JSON-handling code from scratch.

3. Step One: Getting Your "Vibe" Tool (AI Studio)

To power this experience, you need access to the Gemini 3.1 Flash brain.

Go to aistudio.google.com.

Sign in with your Google account.

API Key: On the left sidebar, click "Get API Key." Generate a new key and copy it. (Note: This is free for students!)

4. The "Vibe" Workflow: Step by Step
Task A: The Fresno/NY JSON Fetch

The National Weather Service (NWS) is a public service. To get data from them, you don't need a key, but you must identify yourself with a "User-Agent" header (e.g., "FCC-Student-App").

The Prompt for Gemini:

"I am a Java student using Spring Boot. Help me write a simple program that uses the National Weather Service API (api.weather.gov) to fetch the current weather for Fresno, CA and New York, NY. I want the output to be raw JSON. Include a 'User-Agent' header in the request."

Task B: Making it Human Readable

Once you see the raw JSON, it's time to "Vibe" the UI.

The Prompt for Gemini:

"Now, take that JSON data and create a Spring Boot web controller. Create a professional HTML 'Dashboard' page using CSS that displays the weather for Fresno and New York in a clean, human-readable way."

5. The Digital Handshake: Ngrok

In my Face-to-Face classes, we usually enter our neighbor's IP4 address to see their work. Since we are online, your "localhost" is invisible to your classmates—unless we use a tunnel.

Download Ngrok (ngrok.com). It’s a free tool that creates a secure public URL for your local server.

Run your Spring Boot app on port 8080.

In your terminal, type: ngrok http 8080.

The Magic: Ngrok will give you a public URL (e.g., https://xyz.ngrok-free.app).

Post your URL in the Canvas Discussion board! This is how we will "walk around the room" and see each other's dashboards.

6. 🌟 Bonus Opportunity: "London Calling" (+5 Points)

The NWS only covers the USA. To get London’s weather, you must use an international service.

The Task: "Vibe" an integration with the Open-Meteo API (api.open-meteo.com). It is free and requires no account. Can you make your dashboard truly global?

Submission Requirements:

Code: Your pom.xml and Java source files.

The Link: Post your Ngrok URL to the Canvas Lab 1 thread.

The "Vibe" Reflection: A short paragraph on how it felt to "orchestrate" the code rather than typing every line manually.
