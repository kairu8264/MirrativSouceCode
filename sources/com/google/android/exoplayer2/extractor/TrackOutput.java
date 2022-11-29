package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes3.dex */
public interface TrackOutput {
    public static final int SAMPLE_DATA_PART_ENCRYPTION = 1;
    public static final int SAMPLE_DATA_PART_MAIN = 0;
    public static final int SAMPLE_DATA_PART_SUPPLEMENTAL = 2;

    /* loaded from: classes3.dex */
    public static final class CryptoData {
        public final int clearBlocks;
        public final int cryptoMode;
        public final int encryptedBlocks;
        public final byte[] encryptionKey;

        public CryptoData(int i10, byte[] bArr, int i11, int i12) {
            this.cryptoMode = i10;
            this.encryptionKey = bArr;
            this.encryptedBlocks = i11;
            this.clearBlocks = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || CryptoData.class != obj.getClass()) {
                return false;
            }
            CryptoData cryptoData = (CryptoData) obj;
            return this.cryptoMode == cryptoData.cryptoMode && this.encryptedBlocks == cryptoData.encryptedBlocks && this.clearBlocks == cryptoData.clearBlocks && Arrays.equals(this.encryptionKey, cryptoData.encryptionKey);
        }

        public int hashCode() {
            return (((((this.cryptoMode * 31) + Arrays.hashCode(this.encryptionKey)) * 31) + this.encryptedBlocks) * 31) + this.clearBlocks;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface SampleDataPart {
    }

    void format(Format format);

    default int sampleData(DataReader dataReader, int i10, boolean z10) throws IOException {
        return sampleData(dataReader, i10, z10, 0);
    }

    int sampleData(DataReader dataReader, int i10, boolean z10, int i11) throws IOException;

    void sampleData(ParsableByteArray parsableByteArray, int i10, int i11);

    void sampleMetadata(long j10, int i10, int i11, int i12, CryptoData cryptoData);

    default void sampleData(ParsableByteArray parsableByteArray, int i10) {
        sampleData(parsableByteArray, i10, 0);
    }
}
