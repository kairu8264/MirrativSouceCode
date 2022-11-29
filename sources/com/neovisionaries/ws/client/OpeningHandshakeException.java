package com.neovisionaries.ws.client;

import hn.k0;
import hn.o0;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class OpeningHandshakeException extends WebSocketException {

    /* renamed from: x  reason: collision with root package name */
    public final k0 f28255x;

    /* renamed from: y  reason: collision with root package name */
    public final Map<String, List<String>> f28256y;

    /* renamed from: z  reason: collision with root package name */
    public final byte[] f28257z;

    public OpeningHandshakeException(o0 o0Var, String str, k0 k0Var, Map<String, List<String>> map) {
        this(o0Var, str, k0Var, map, null);
    }

    public OpeningHandshakeException(o0 o0Var, String str, k0 k0Var, Map<String, List<String>> map, byte[] bArr) {
        super(o0Var, str);
        this.f28255x = k0Var;
        this.f28256y = map;
        this.f28257z = bArr;
    }
}
