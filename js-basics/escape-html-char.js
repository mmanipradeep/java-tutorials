const escapechar = (str) => str.replace(/[&<>"']/g, (m) => (
    { '&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;', "'": '&#39;' 
}[m]))

console.log(escapechar('<div class="medium">Hi Medium.</div>') );
// &lt;div class=&quot;medium&quot;&gt;Hi Medium.&lt;/div&gt