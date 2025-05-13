package com.musicapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import java.nio.charset.StandardCharsets;

@Controller
public class MusicController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/download")
    @ResponseBody
    public ResponseEntity<byte[]> downloadSheet(@RequestBody String data) {
        byte[] content = data.getBytes(StandardCharsets.UTF_8);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        headers.setContentDisposition(ContentDisposition.builder("attachment")
                .filename("sheetmusic.txt").build());

        return new ResponseEntity<>(content, headers, HttpStatus.OK);
    }
}
