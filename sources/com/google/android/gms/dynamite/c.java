package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes3.dex */
public final class c implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0239a interfaceC0239a) throws DynamiteModule.LoadingException {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int a10 = interfaceC0239a.a(context, str);
        bVar.f27245a = a10;
        if (a10 != 0) {
            bVar.f27247c = -1;
        } else {
            int b10 = interfaceC0239a.b(context, str, true);
            bVar.f27246b = b10;
            if (b10 != 0) {
                bVar.f27247c = 1;
            }
        }
        return bVar;
    }
}
