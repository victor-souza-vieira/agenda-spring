## **EVIDÊNCIA DE IMPLANTAÇÃO**
**Conductor**

*****
### Nome da Squad: Valhala
### Nome do Projeto/Incidente: Automação Interface Contábil SGR
### Emissor demandante: Mercado Pago
### ID do Projeto/Incidente: <a href="https://conductortech.visualstudio.com/Valhalla%20Team/_sprints/backlog/Valhalla%20Team/Valhalla%20Team/Sprint%2017%20-%20Valhalla%20Team?workitem=20888"> #20888 </a>
### PO Responsável: Bryanne Stefany De Araujo Cezario
### Desenvolvedor Responsável: Leonardo Fioravanso
### Categoria da Implantação: SGR
### GMUD: M2106-181
### ID Work Item: <a href="https://conductortech.visualstudio.com/Valhalla%20Team/_sprints/backlog/Valhalla%20Team/Valhalla%20Team/Sprint%2017%20-%20Valhalla%20Team?workitem=55591">#34725</a>

### 
****




## 1. **Resumo da Implantação**
### Descreva resumidamente solução ou correção implantada:

_Gerar o arquivo de interface contábil para o emissor Mercado Pago_.



***



## 2. **Plataformas**
### Quais plataformas terão impacto com a alteração implantada: Mercado Pago
### Qual será o emissor piloto da implantação: Mercado Pago




*****



## 3. **Informações referente aos cenários de evidência**

### 3.1 Sistema/Aplicação utilizado: SGR


****


## 4. **Cenário Atual (Sem Implementação)**



### 4.1 Resultado esperado sem implementação: Não poder gerar arquivo de interface contábil para o emissor Mercado Pago
_Como ainda não existe o suporte ao Mercado Pago irá ocorrer um erro ao tentar gerar o arquivo de interface contábil para este emissor_.

### Passo a passo para simular o cenário:

_a.) Instalar a versão do 1.0.14 do plugin de interface contábil_;

_b.) Criar uma rotina, no SGR, de interface contábil para Mercado Pago_;

_c.) Executar a rotina criada para o emissor_.


### 4.2 Prints do Cenário sem implementação

_Resultado encontrado:_


![image.png](https://github.com/victor-souza-vieira/agenda-spring/blob/master/images/Job%20executando.PNG)
Figura 1 - Executando job de interface contábil para o Mercado Pago.

![image.png](https://github.com/victor-souza-vieira/agenda-spring/blob/master/images/Job%20Falho.PNG)
Figura 2 - Falha na execução do job.

![image.png](https://github.com/victor-souza-vieira/agenda-spring/blob/master/images/Falha.PNG)
Figura 3 - Causa da falha da execução.


****




## 5.  **Cenário Esperado**



### 5.1 Resultado esperado com implementação_: Ex.: Geração do arquivo de interface contábil para o Mercado Pago

## _Passo a passo para simular o cenário_:

_a.) Instalar a versão 1.0.20-SNAPSHOT do plugin de interface contábil_;

_a.) Criar a rotina job, no SGR, de interface contábil para o Mercado Pago_;

_b.) Executar a rotina job criada_.



### 5.2 Prints do Cenário com implementação
_Resultado encontrado:_

![image.png](https://github.com/victor-souza-vieira/agenda-spring/blob/master/images/Execu%C3%A7%C3%A3oManual.PNG)
Figura 4 - Histórico da execução do plugin de interface contábil atendendo ao emissor Mercado Pago

![image.png](https://github.com/victor-souza-vieira/agenda-spring/blob/master/images/HistoricoManual.PNG)
Figura 5 - Histórico de processamento do plugin com status processado.

![image.png](https://github.com/victor-souza-vieira/agenda-spring/blob/master/images/ArquivoExecManual.PNG)
Figura 6 - Arquivo de interface contábil gerado ao término da execução do plugin.



*****


## 6. **Conclusão**

### Informar quais conclusões obteve, de acordo com os cenários apresentados:
_Ex: Após a execução da rotina o arquivo de interface contábil para o Mercado Pago foi gerado com sucesso_. 
