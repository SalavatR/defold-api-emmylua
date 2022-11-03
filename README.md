
# defold-api-emmylua
Project for generating defold api headers for lua-language-server plugin.

[lua-language-server](https://github.com/sumneko/lua-language-server) is a lua plugin for VScode

# How it work
This app download docs for last defold version and generate lua headers.
Lua header is a valid lua files, which have all functions and variables that was described in doc.

# How to use it
The language server and Visual Studio Code client can be installed from the VS Code Marketplace.

https://github.com/sumneko/lua-language-server/wiki/Libraries


# How to generate headers.

1)Clone repository

2)Run main method from Main.java
-it will download json docs and create lua files with api headers

3)Compress DefoldDocs/api to zip. [OPTIONAL]