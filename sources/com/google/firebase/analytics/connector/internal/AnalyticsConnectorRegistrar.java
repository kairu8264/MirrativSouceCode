package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import pk.c;
import tk.a;
import um.h;
import vk.d;
import vk.i;
import vk.q;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements i {
    @Override // vk.i
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<d<?>> getComponents() {
        return Arrays.asList(d.c(a.class).b(q.j(c.class)).b(q.j(Context.class)).b(q.j(ul.d.class)).f(uk.a.f55961a).e().d(), h.b("fire-analytics", "20.0.0"));
    }
}
