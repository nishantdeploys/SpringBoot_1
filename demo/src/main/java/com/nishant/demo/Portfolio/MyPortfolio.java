package com.nishant.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {

    @GetMapping("/")
    public String Home() {
        return """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>Nishant Portfolio</title>
                    <style>
                        body{
                            font-family:Arial,sans-serif;
                            background:#f4f4f4;
                            margin:0;
                        }

                        nav{
                            background:#222;
                            padding:18px;
                            text-align:center;
                        }

                        nav a{
                            color:white;
                            text-decoration:none;
                            margin:15px;
                            font-size:18px;
                            font-weight:bold;
                        }

                        .container{
                            text-align:center;
                            margin-top:80px;
                        }

                        h1{
                            color:#222;
                        }

                        p{
                            font-size:20px;
                            color:#555;
                        }

                        .btn{
                            display:inline-block;
                            margin:15px;
                            padding:12px 25px;
                            background:#007BFF;
                            color:white;
                            text-decoration:none;
                            border-radius:8px;
                        }

                        .btn:hover{
                            background:#0056b3;
                        }
                    </style>
                </head>

                <body>

                <nav>
                    <a href="/myself">About Me</a>
                    <a href="/skills">Skills</a>
                    <a href="/edu">Education</a>
                    <a href="/pro">Projects</a>
                </nav>

                <div class="container">

                    <h1>Welcome to My Portfolio</h1>

                    <p>Hi 👋 I'm Nishant Kumar</p>

                    <p>Cloud • DevOps • Java • Spring Boot Enthusiast</p>

                    <a class="btn" href="/myself">Know More About Me</a>

                </div>

                </body>
                </html>
                """;
    }
    @GetMapping("/myself")
    public String MySelf() {

        return """
                <html>
                <body style="font-family:Arial;padding:40px">

                <h1>Nishant Kumar</h1>

                <h2>Cloud & Spring Boot Enthusiast</h2>

                <p>
                I'm a B.Tech CSE student at Lovely Professional University.
                I enjoy building scalable backend systems using Java,
                Spring Boot, Microservices, Docker and AWS.
                </p>

                <h3>Profiles</h3>

                <ul>
                    <li>GitHub : https://github.com/nishantdeploys</li>
                    <li>LinkedIn : https://linkedin.com/in/nishxnt</li>
                </ul>

                <a href="/">⬅ Back Home</a>

                </body>
                </html>
                """;
    }
    @GetMapping("/skills")
    public String Skills() {

        return """
                <html>
                <body style="font-family:Arial;padding:40px">

                <h1>My Skills</h1>

                <ul>
                    <li>Java</li>
                    <li>Spring Boot</li>
                    <li>Spring MVC</li>
                    <li>REST APIs</li>
                    <li>Microservices</li>
                    <li>Maven</li>
                    <li>Docker</li>
                    <li>Kubernetes</li>
                    <li>AWS</li>
                    <li>Git & GitHub</li>
                    <li>PostgreSQL</li>
                </ul>

                <a href="/">⬅ Back Home</a>

                </body>
                </html>
                """;
    }








}


