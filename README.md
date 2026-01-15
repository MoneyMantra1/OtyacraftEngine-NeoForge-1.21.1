# OtyacraftEngine(minecraft mod)

Felnull integration mod library.

[CurseForge](https://www.curseforge.com/minecraft/mc-mods/otyacraft-engine)  
[Modrinth](https://modrinth.com/mod/otyacraft-engine)

# Maven coordinates

Group: `dev.felnull`  
Artifact: `otyacraftengine` (common), `otyacraftengine-fabric`, `otyacraftengine-forge`  
Version: see tags/releases

GitHub Packages (Maven): `https://maven.pkg.github.com/TeamFelnull/OtyacraftEngine`

```gradle
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/TeamFelnull/OtyacraftEngine")
        credentials {
            username = System.getenv("GITHUB_ACTOR")
            password = System.getenv("GITHUB_TOKEN")
        }
    }
}
```

# Using libraries

The following libraries are used for this mod,  
but they are included in the mod's jar file and do not need to be installed separately.

[Animated GIF library for Java](https://github.com/rtyley/animated-gif-lib-for-java)  
[Felnull Java library](https://github.com/TeamFelnull/FelNullJavaLibrary) 
