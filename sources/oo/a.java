package oo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import jo.p;

/* loaded from: classes4.dex */
public final class a extends no.a {
    @Override // no.a
    public Random d() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        p.g(current, "current()");
        return current;
    }
}
