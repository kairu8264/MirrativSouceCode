package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: classes4.dex */
public final class SendException extends Exception {

    /* renamed from: w  reason: collision with root package name */
    public final int f27998w;

    public SendException(String str) {
        super(str);
        this.f27998w = a(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int a(String str) {
        char c10;
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (lowerCase.equals("service_not_available")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1290953729:
                if (lowerCase.equals("toomanymessages")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -920906446:
                if (lowerCase.equals("invalid_parameters")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -617027085:
                if (lowerCase.equals("messagetoobig")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -95047692:
                if (lowerCase.equals("missing_to")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0 || c10 == 1) {
            return 1;
        }
        if (c10 != 2) {
            if (c10 != 3) {
                return c10 != 4 ? 0 : 4;
            }
            return 3;
        }
        return 2;
    }
}
