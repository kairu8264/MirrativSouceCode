package coil.network;

import ep.d0;

/* loaded from: classes.dex */
public final class HttpException extends RuntimeException {

    /* renamed from: w  reason: collision with root package name */
    public final d0 f20020w;

    public HttpException(d0 d0Var) {
        super("HTTP " + d0Var.h() + ": " + d0Var.q());
        this.f20020w = d0Var;
    }
}
