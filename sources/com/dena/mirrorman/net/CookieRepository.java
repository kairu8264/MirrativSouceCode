package com.dena.mirrorman.net;

import android.webkit.CookieManager;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import en.a;
import ep.m;
import ep.v;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import jo.p;
import kf.c;
import wn.k;
import xm.e;
import xn.a0;
import xn.n0;
import xn.s;

/* loaded from: classes2.dex */
public final class CookieRepository {
    public static final int $stable = 8;
    private final c cookiePreference;
    private final e gson;
    private final Type listType;
    private final ServerConfig serverConfig;

    public CookieRepository(c cVar, ServerConfig serverConfig) {
        p.h(cVar, "cookiePreference");
        p.h(serverConfig, "serverConfig");
        this.cookiePreference = cVar;
        this.serverConfig = serverConfig;
        this.gson = new e();
        this.listType = new a<Map<String, ? extends String>>() { // from class: com.dena.mirrorman.net.CookieRepository$listType$1
        }.getType();
    }

    private final List<String> convertToArray(String str) {
        boolean z10;
        List<String> d10 = new so.e(";").d(str, 0);
        if (!d10.isEmpty()) {
            ListIterator<String> listIterator = d10.listIterator(d10.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() == 0) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (!z10) {
                    return a0.w0(d10, listIterator.nextIndex() + 1);
                }
            }
        }
        return s.k();
    }

    private final k<String, String> convertToPair(String str) {
        List k10;
        boolean z10;
        int length = str.length() - 1;
        int i10 = 0;
        boolean z11 = false;
        while (i10 <= length) {
            boolean z12 = p.j(str.charAt(!z11 ? i10 : length), 32) <= 0;
            if (z11) {
                if (!z12) {
                    break;
                }
                length--;
            } else if (z12) {
                i10++;
            } else {
                z11 = true;
            }
        }
        List<String> d10 = new so.e("=").d(str.subSequence(i10, length + 1).toString(), 2);
        if (!d10.isEmpty()) {
            ListIterator<String> listIterator = d10.listIterator(d10.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() == 0) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (!z10) {
                    k10 = a0.w0(d10, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        k10 = s.k();
        if (k10.size() <= 1) {
            return null;
        }
        return new k<>(k10.get(0), k10.get(1));
    }

    private final Map<String, String> deserialize(String str) {
        return (Map) this.gson.j(str, this.listType);
    }

    private final String serialize(Map<String, String> map) {
        String t10 = this.gson.t(map, this.listType);
        p.g(t10, "gson.toJson(cookies, listType)");
        return t10;
    }

    public final List<m> getCookieList(v vVar) {
        p.h(vVar, "url");
        ArrayList arrayList = new ArrayList();
        try {
            String cookie = CookieManager.getInstance().getCookie(vVar.x().toString());
            if (cookie != null) {
                for (String str : convertToArray(cookie)) {
                    k<String, String> convertToPair = convertToPair(str);
                    if (convertToPair != null) {
                        arrayList.add(new m.a().d(convertToPair.c()).e(convertToPair.d()).b(vVar.i()).a());
                    }
                }
            }
            List<m> unmodifiableList = Collections.unmodifiableList(arrayList);
            p.g(unmodifiableList, "unmodifiableList(cookieList)");
            return unmodifiableList;
        } catch (Throwable th2) {
            g9.a.c(th2);
            throw new IOException("Cookie Error");
        }
    }

    public final Map<String, String> getCookies() {
        return deserialize(this.cookiePreference.e0());
    }

    public final void updateOkhttpCookies(List<m> list) {
        Map<String, String> p10;
        p.h(list, "cookieList");
        Map<String, String> cookies = getCookies();
        if (cookies == null || (p10 = n0.p(cookies)) == null) {
            return;
        }
        for (m mVar : list) {
            p10.put(mVar.e(), mVar.g());
        }
        this.cookiePreference.J2(serialize(p10));
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            for (m mVar2 : list) {
                String serverURL = this.serverConfig.getServerURL();
                cookieManager.setCookie(serverURL, mVar2.e() + '=' + mVar2.g());
                String clogServerURL = this.serverConfig.getClogServerURL();
                cookieManager.setCookie(clogServerURL, mVar2.e() + '=' + mVar2.g());
            }
            cookieManager.flush();
        } catch (Throwable th2) {
            g9.a.c(th2);
        }
    }
}
