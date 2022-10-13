const escape = (string) => {
  const escapeMaps = {
    '&': 'amp',
    '<': 'lt',
    '>': 'gt',
    '"': 'quot',
    "'": '#39'
  }
  // The effect here is the same as that of /[&amp;<> "']/g
  const escapeRegexp = new RegExp(`[${Object.keys(escapeMaps).join('')}]`, 'g')
  return string.replace(escapeRegexp, (match) => `&${escapeMaps[match]};`)
}

console.log(escape(`
  <div>
    <p>hello world</p>
  </div>
`))
/*
&lt;div&gt;
  &lt;p&gt;hello world&lt;/p&gt;
&lt;/div&gt;
*/