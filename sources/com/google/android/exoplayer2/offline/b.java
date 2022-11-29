package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements MetadataOutput {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ b f26901w = new b();

    @Override // com.google.android.exoplayer2.metadata.MetadataOutput
    public final void onMetadata(Metadata metadata) {
        DownloadHelper.lambda$getRendererCapabilities$1(metadata);
    }
}
