package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import er.s;
import in.o;
import in.w;
import nn.a;
import nn.b;
import nn.g;
import nn.h;
import xm.f;

/* loaded from: classes4.dex */
public class TwitterApiException extends TwitterException {

    /* renamed from: w  reason: collision with root package name */
    public final a f28262w;

    /* renamed from: x  reason: collision with root package name */
    public final w f28263x;

    /* renamed from: y  reason: collision with root package name */
    public final int f28264y;

    /* renamed from: z  reason: collision with root package name */
    public final s f28265z;

    public TwitterApiException(s sVar) {
        this(sVar, c(sVar), d(sVar), sVar.b());
    }

    public static String a(int i10) {
        return "HTTP request failed, Status: " + i10;
    }

    public static a b(String str) {
        try {
            b bVar = (b) new f().d(new g()).d(new h()).b().i(str, b.class);
            if (bVar.f43713a.isEmpty()) {
                return null;
            }
            return bVar.f43713a.get(0);
        } catch (JsonSyntaxException e10) {
            in.h g10 = o.g();
            g10.c("Twitter", "Invalid json: " + str, e10);
            return null;
        }
    }

    public static a c(s sVar) {
        try {
            String N = sVar.d().n().A().clone().N();
            if (TextUtils.isEmpty(N)) {
                return null;
            }
            return b(N);
        } catch (Exception e10) {
            o.g().c("Twitter", "Unexpected response", e10);
            return null;
        }
    }

    public static w d(s sVar) {
        return new w(sVar.e());
    }

    public TwitterApiException(s sVar, a aVar, w wVar, int i10) {
        super(a(i10));
        this.f28262w = aVar;
        this.f28263x = wVar;
        this.f28264y = i10;
        this.f28265z = sVar;
    }
}
