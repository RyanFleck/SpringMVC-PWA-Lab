# SpringMVC-PWA-Lab

[![Build Status](https://travis-ci.com/RyanFleck/SpringMVC-PWA-Lab.svg?branch=master)](https://travis-ci.com/RyanFleck/SpringMVC-PWA-Lab)

Spring MVC app in preparation for a collaborative PWA experiment. Current test application makes heavy usage of *autowiring*.

**Run with:**
```sh
# Gradle installation > 4.0
gradle clean build bootRun

# Use built-in Gradle:
gradlew clean build bootRun

# Application now served at http://localhost:8080/
```

**Ideas:**
1. Collaborative, cell-based jupyter-like markdown editor.
  - Users can collaborate on the content, styling, and metadata.
  - Can export to markdown, asciidoc, html, etc.
1. Dungon Management System.
  - Text and Audio Chat over WebRTC.
  - Log of events that can be exported for long-distance games.
  - Inventory, spell, status management system for players.
  - Catalogue of items, spells, monsters for reference.
1. Social Media Network.
  - Users can login and post things.
  - Posts appear on a collective timeline.
  - Users can chat with one another.

**Resources:**
1. [Spring MVC w/Gradle from Scratch](https://spring.io/guides/gs/serving-web-content/#scratch)
1. CI with [Gradle and Travis](https://docs.travis-ci.com/user/languages/java/#projects-using-gradle)
1. [Spring MVC Example](https://www.mkyong.com/spring-mvc/gradle-spring-mvc-web-project-example/)
1. Front-End: using [React with Spring](https://spring.io/guides/tutorials/react-and-spring-data-rest/)
1. Synchronized clients using [Java API WebSockets](https://benas.github.io/2016/02/21/using-the-java-api-for-webSocket-to-create-a-chat-server.html) and [STOMP with Spring Controllers](https://spring.io/guides/gs/messaging-stomp-websocket/)
1. Search for [HTTP KeepAlive](https://lob.com/blog/use-http-keep-alive) solution.
1. [Stripe](https://www.baeldung.com/java-stripe-api) payments API.

**Contributors:**
- [Adittya I.](https://github.com/aadit041)
- [Yashar A.](https://github.com/YasharAhmat)
- [Terence D.](https://github.com/TerryCruze)
- [Saimoon A.](https://github.com/sazad32)
- [Ryan F.](https://github.com/ryanfleck/)
