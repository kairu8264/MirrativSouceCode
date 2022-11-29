package no;

import java.util.Random;

/* loaded from: classes4.dex */
public abstract class a extends c {
    @Override // no.c
    public int b() {
        return d().nextInt();
    }

    @Override // no.c
    public int c(int i10) {
        return d().nextInt(i10);
    }

    public abstract Random d();
}
