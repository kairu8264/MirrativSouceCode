package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.text.TextOutput;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements TextOutput {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ c f26902w = new c();

    @Override // com.google.android.exoplayer2.text.TextOutput
    public final void onCues(List list) {
        DownloadHelper.lambda$getRendererCapabilities$0(list);
    }
}
