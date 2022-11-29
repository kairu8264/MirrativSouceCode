package com.google.android.gms.internal.ads;

import ai.xj3;
import java.io.IOException;

/* loaded from: classes3.dex */
public class zzggm extends IOException {

    /* renamed from: w  reason: collision with root package name */
    public xj3 f27285w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f27286x;

    public zzggm(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f27285w = null;
    }

    public static zzggm d() {
        return new zzggm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static zzggm e() {
        return new zzggm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzggm f() {
        return new zzggm("CodedInputStream encountered a malformed varint.");
    }

    public static zzggm g() {
        return new zzggm("Protocol message contained an invalid tag (zero).");
    }

    public static zzggm h() {
        return new zzggm("Protocol message end-group tag did not match expected tag.");
    }

    public static zzggl i() {
        return new zzggl("Protocol message tag had invalid wire type.");
    }

    public static zzggm j() {
        return new zzggm("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static zzggm k() {
        return new zzggm("Failed to parse the message.");
    }

    public static zzggm l() {
        return new zzggm("Protocol message had invalid UTF-8.");
    }

    public final zzggm a(xj3 xj3Var) {
        this.f27285w = xj3Var;
        return this;
    }

    public final void b() {
        this.f27286x = true;
    }

    public final boolean c() {
        return this.f27286x;
    }

    public zzggm(String str) {
        super(str);
        this.f27285w = null;
    }
}
