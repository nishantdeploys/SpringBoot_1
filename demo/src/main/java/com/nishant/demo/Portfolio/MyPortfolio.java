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








}


