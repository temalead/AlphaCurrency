package alpha.currency.service.gif;


import alpha.currency.model.Gif;

public interface GifService {
    Gif getGif(String request);
    String getEndpointDependingDelta(String currency);
}
