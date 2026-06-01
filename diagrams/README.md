Para exportar los diagramas Mermaid a SVG instala y usa `@mermaid-js/mermaid-cli` (requiere Node.js):

1) Instalar mermaid-cli:

```bash
npm install -g @mermaid-js/mermaid-cli
```

2) Generar SVG desde cada `.mmd`:

```bash
mmdc -i diagrams/classes.mmd -o diagrams/classes.svg
mmdc -i diagrams/sequence.mmd -o diagrams/sequence.svg
```

Si no tienes Node.js, puedes usar el servicio en línea de Mermaid Live Editor (https://mermaid.live) para pegar el contenido de los `.mmd` y exportar SVG manualmente.
