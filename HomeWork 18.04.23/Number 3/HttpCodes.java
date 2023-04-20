package HomeWork18_04;

import java.util.function.Predicate;
import java.util.stream.Stream;

public enum HttpCodes implements Action {
    INFORMATIONAL(100, 199),

    SUCCESS(200, 299),
    REDIRECTION(300, 399),
    CLIENTERROR(400, 499),
    SERVERERROR(500, 599);
    private int from;
    private int to;

    HttpCodes(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public static void findValueByCode(int code) {
        HttpCodes findEnum = Stream.of(HttpCodes.values())
                .filter(cd -> cd.from <= code && code <= cd.to)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException());
        findEnum.action(code,findEnum);
    }

    @Override
    public void action(int code, HttpCodes d) {
        if(INFORMATIONAL.from <= code && code <= INFORMATIONAL.to ) {
            System.out.println("http code: " + code + ": " + INFORMATIONAL);
        }else if(SUCCESS.from <= code && code <= SUCCESS.to){
            System.out.println("http code: " + code + ": " + SUCCESS);
        } else if (REDIRECTION.from <= code && code <= REDIRECTION.to) {
            System.out.println("http code: " + code + ": " + REDIRECTION);
        } else if (CLIENTERROR.from <= code && code <= CLIENTERROR.to) {
            System.out.println("http code: " + code + ": " + CLIENTERROR);
        } else if (SERVERERROR.from <= code && code <= SERVERERROR.to) {
            System.out.println("http code: " + code + ": " + SERVERERROR);
        }
    }
}
