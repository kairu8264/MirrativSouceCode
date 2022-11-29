package com.dena.mirrorman.net;

import ep.m;
import ep.n;
import ep.v;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class MRCookieJar implements n {
    public static final int $stable = 8;
    private final CookieRepository cookieRepository;

    public MRCookieJar(CookieRepository cookieRepository) {
        p.h(cookieRepository, "cookieRepository");
        this.cookieRepository = cookieRepository;
    }

    @Override // ep.n
    public List<m> loadForRequest(v vVar) {
        p.h(vVar, "url");
        return this.cookieRepository.getCookieList(vVar);
    }

    @Override // ep.n
    public void saveFromResponse(v vVar, List<m> list) {
        p.h(vVar, "url");
        p.h(list, "cookies");
        this.cookieRepository.updateOkhttpCookies(list);
    }
}
