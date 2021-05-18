package com.example;

import com.example.entity.Kisi;
import com.example.repository.KisiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kisi")
public class KisiController {

    private final KisiRepository kisiRepository;

    @PostConstruct
    public void init(){
        Kisi kisi =new Kisi();
        kisi.setAd("Haydi");
        kisi.setSoyad("Kodlayalim");
        kisi.setAdres("test");
        kisi.setDogumTarihi(Calendar.getInstance().getTime());
        kisi.setId("K0001");
        kisiRepository.save(kisi);
    }

    @GetMapping("/{search}")
    public ResponseEntity<List<Kisi>> getKisi(@PathVariable String search) {
        List<Kisi> kisiler = kisiRepository.findByAdLikeOrSoyadLike(search, search);
        return ResponseEntity.ok(kisiler);
    }
}