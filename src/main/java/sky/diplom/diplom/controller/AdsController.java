package sky.diplom.diplom.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sky.diplom.diplom.dto.AdsDto;
import sky.diplom.diplom.dto.FullAdsDto;
import sky.diplom.diplom.dto.ResponseWrapperAds;


//@CrossOrigin(value = "http://localhost:3000")
@RequiredArgsConstructor
@RestController
@RequestMapping("/ads")
@Tag(name = "Объявления", description = "AdsController")
public class AdsController {

    private static final Logger logger = LoggerFactory.getLogger(AdsController.class);

    @GetMapping
    public ResponseWrapperAds<AdsDto> getAllAds() {

        return null;
    }

//  MULTIPART_FORM_DATA_VALUE - Этот формат используется для передачи данных,
// когда требуется отправить несколько данных в одном запросе, например, изображения и другие файлы.
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<AdsDto> addAds() {

        return null;
    }


    @GetMapping("/{adId}")
    public ResponseEntity<FullAdsDto> getFullAd() {

        return null;
    }


    @DeleteMapping("/{adId}")
    public ResponseEntity<Void> removeAds() {

        return null;
    }


    @PatchMapping("/{adId}")
    public ResponseEntity<AdsDto> updateAds() {

        return null;
    }


    @GetMapping("/me")
    public ResponseWrapperAds<AdsDto> getAdsMe() {

        return null;
    }

    @PatchMapping(value = "/{id}/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> updateAdsImage() {

        return null;
    }

//    printLogInfo - это метод, используется для логирования действий пользователя в этом классе.
//     Метод печатает информацию о том, какой метод был вызван.
    private void printLogInfo(String requestMethod, String path, String name) {
        logger.info("Вызван метод " + name + ", адрес "
                + requestMethod.toUpperCase() + " запроса /ads" + path);
    }
}