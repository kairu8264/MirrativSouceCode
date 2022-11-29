package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import rk.a;
import rk.b;
import um.h;
import vk.d;
import vk.e;
import vk.i;
import vk.q;

@Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(e eVar) {
        return new a((Context) eVar.a(Context.class), eVar.d(tk.a.class));
    }

    @Override // vk.i
    public List<d<?>> getComponents() {
        return Arrays.asList(d.c(a.class).b(q.j(Context.class)).b(q.i(tk.a.class)).f(b.f51564a).d(), h.b("fire-abt", "21.0.0"));
    }
}
