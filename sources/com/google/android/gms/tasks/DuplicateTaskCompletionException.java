package com.google.android.gms.tasks;

import vi.g;

/* loaded from: classes3.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    public DuplicateTaskCompletionException(String str, Throwable th2) {
        super(str, th2);
    }

    public static IllegalStateException a(g<?> gVar) {
        String str;
        if (!gVar.r()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception n10 = gVar.n();
        if (n10 != null) {
            str = "failure";
        } else if (gVar.s()) {
            str = "result ".concat(String.valueOf(gVar.o()));
        } else {
            str = gVar.q() ? "cancellation" : "unknown issue";
        }
        return new DuplicateTaskCompletionException(str.length() != 0 ? "Complete with: ".concat(str) : new String("Complete with: "), n10);
    }
}
