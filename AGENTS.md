Target: NeoForge 1.21.1

Java: 21

Goal: ./gradlew build succeeds

Keep behavior identical unless required for compatibility

Prefer minimal diffs; don’t reformat everything

After build passes, run a client dev run if available (runClient / runGameTestServer depending on setup)

If the project is Architectury multi-loader: keep common logic shared; put loader specifics in the NeoForge module
