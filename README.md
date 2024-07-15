# Spring AI in Action

## Usage

### Make requests from WSL

Find Windows' IP address:

```bash
ip route show | grep -i default | awk '{ print $3 }'
```

Check that you can reach the service:

```bash
curl $WINDOWS_IP:8080/hello
```

Make requests:

```bash
curl $WINDOWS_IP:8080/ask -H"Content-type: application/json" -d'{"question":"Why is the sky blue?"}'
```
