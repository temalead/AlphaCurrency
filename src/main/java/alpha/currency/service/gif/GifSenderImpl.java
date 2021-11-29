package alpha.currency.service.gif;


import alpha.currency.model.Datum;
import alpha.currency.model.Gif;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class GifSenderImpl implements GifSender {
    private final GifService gifService;

    /**
     *
     * @return url of random gif from gif list
     */
    @Override
    public String getGifByCurrency(String appId, String currency) {
        Random random = new Random();
        Gif gif = gifService.getGif(appId,currency);
        List<Datum> data = gif.getData();
        Datum datum = data.get(random.nextInt(data.size()));
        System.out.println(datum.getImages().getOriginal().getUrl());
        return datum.getImages().getDownsized().getUrl();
    }
}