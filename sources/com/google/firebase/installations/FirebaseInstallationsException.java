package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* loaded from: classes4.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* renamed from: w  reason: collision with root package name */
    public final a f27958w;

    /* loaded from: classes4.dex */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(a aVar) {
        this.f27958w = aVar;
    }

    public FirebaseInstallationsException(String str, a aVar) {
        super(str);
        this.f27958w = aVar;
    }
}
